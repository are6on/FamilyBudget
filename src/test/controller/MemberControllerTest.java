package controller;

import org.junit.Before;
import org.junit.Test;
import repository.MemberRepository;

import static org.junit.Assert.fail;

public class MemberControllerTest {
    MemberRepository r;
    MemberController c;
    @Before
    public void setUp() throws Exception{
        r=new MemberRepository();
        c=new MemberController(r);
    }

    @Test
    public void testcase1() {
        try {
            c.addMember("Bam", 0);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testcase2() {
        try {
            c.addMember("Tom", -1);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase3() {
        try {
            c.addMember("tom", 1);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase4() {
        try {
            c.addMember("TOm", 2);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase5() {
        try {
            c.addMember("T0m", 3);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase6() {
        try {
            c.addMember("T@m", 4);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase7() {
        try {
            c.addMember("T", 5);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase8() {
        try {
            c.addMember("Ron",0);
        } catch (Exception e) {

        }
        try {
            c.addMember("Tom", 0);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase9() {
        try {
            c.addMember("T", -2);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase10() {
        try {
            c.addMember("Mat", Integer.MAX_VALUE);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testcase11() {
        try {
            c.addMember("Tom", Integer.MAX_VALUE + 1);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase12() {
        try {
            c.addMember("Tom", Integer.MAX_VALUE - 1);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testcase13() {
        try {
            c.addMember("", 2);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase14() {
        try {
            c.addMember("Qaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 4);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testcase15() {
        try {
            c.addMember("Qaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 5);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase16() {
        try {
            c.addMember("Qaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 6);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testcase17() {
        try {
            c.addMember("Tom", 1);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}