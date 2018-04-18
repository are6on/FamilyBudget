import controller.EntryController;
import model.Entry;
import org.junit.Before;
import org.junit.Test;
import repository.EntryRepository;
import repository.MemberRepository;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BigBangIntegretionTest {
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
    public void testCaseB(){
        try {
            c.addEntry("cost",13,1);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testCaseC(){

        List<Entry> list=c.allEntriesForMember(1);
        assertTrue(4==list.size());
    }

    @Test
    public void testCaseALL(){
        try {
            rm.addMember("Max",4);
            c.addEntry("cost",4,4);
            List<Entry> list=c.allEntriesForMember(4);
            assertTrue(1==list.size());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}