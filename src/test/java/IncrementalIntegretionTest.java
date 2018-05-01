import controller.EntryController;
import model.Entry;
import org.junit.Before;
import org.junit.Test;
import repository.EntryRepository;
import repository.MemberRepository;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class IncrementalIntegretionTest {
    EntryRepository re;
    MemberRepository rm;
    EntryController c;
    @Before
    public void setUp() throws Exception{
        re=new EntryRepository();
        rm=new MemberRepository();
        c=new EntryController(re, rm);
        rm.addMember("Jon",1);
    }

    @Test
    public void testCaseA(){
        try {
            rm.addMember("Max",2);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testCaseAB(){
        try {
            rm.addMember("Max",4);
            c.addEntry("cost",4,4);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }


    @Test
    public void testCaseABC(){
        try {
            rm.addMember("Tom",4);
            c.addEntry("cost",4,4);
            List<Entry> list=c.allEntriesForMember(4);
            assertTrue(1==list.size());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}