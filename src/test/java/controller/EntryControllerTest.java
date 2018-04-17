package controller;

import org.junit.Before;
import org.junit.Test;
import repository.EntryRepository;
import repository.MemberRepository;

import static org.junit.Assert.fail;

public class EntryControllerTest {
    EntryRepository r;
    MemberRepository rm;
    EntryController c;
    @Before
    public void setUp() throws Exception{
        r=new EntryRepository();
        rm=new MemberRepository();
        c=new EntryController(r, rm);
        rm.addMember("Jon",1);
    }

    @Test
    public void testcase1(){
        try{
            c.addEntry("cosst",12,1);
            fail();
        }catch (Exception e){
        }
    }

    @Test
    public void testcase2(){
        try{
            c.addEntry("cost",0,1);
            fail();
        }catch (Exception e){

        }
    }

    @Test
    public void testcase3(){
        try{
            c.addEntry("cost",-2,1);
            fail();
        }catch (Exception e){

        }
    }

    @Test
    public void testcase4(){
        try{
            c.addEntry("cost",12,-1);
            fail();
        }catch (Exception e){

        }
    }

    @Test
    public void testcase5(){
        try{
            c.addEntry("cost",12,2);
            fail();
        }catch (Exception e){

        }
    }

    @Test
    public void testcase6(){
        try{
            c.addEntry("cost",12,1);
        }catch (Exception e){
            fail(e.getMessage());
        }
    }
}