package controller;

import org.junit.Before;
import org.junit.Test;
import repository.EntryRepository;

import static org.junit.Assert.fail;

public class EntryControllerTest {
    EntryRepository r;
    EntryController c;
    @Before
    public void setUp() throws Exception{
        r=new EntryRepository();
        c=new EntryController(r);
    }

    @Test
    public void testcase1(){
        try{
            c.addEntry("cost",0,0);
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Test
    public void testcase2(){
        try{
            c.addEntry("incom",12,-4);
            fail();
        }catch (Exception e){

        }
    }
}