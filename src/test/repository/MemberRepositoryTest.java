package repository;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

public class MemberRepositoryTest {
    MemberRepository r;
    @Before
    public void setUp() throws Exception{
        r=new MemberRepository();
    }

    @Test
    public void testcasecorect() {
        try {
            r.addMember("Bam", 0);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
/*
    @Test
    public void testcase2() {
        try {
            r.addMember("Tom", -1);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase3() {
        try {
            r.addMember("tom", 1);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase4() {
        try {
            r.addMember("TOm", 2);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase5() {
        try {
            r.addMember("T0m", 3);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase6() {
        try {
            r.addMember("T@m", 4);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase7() {
        try {
            r.addMember("T", 5);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase8() {
        try {
            r.addMember("Ron",0);
        } catch (Exception e) {

        }
        try {
            r.addMember("Tom", 0);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase9() {
        try {
            r.addMember("T", -2);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase10() {
        try {
            r.addMember("Mat", Integer.MAX_VALUE);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testcase11() {
        try {
            r.addMember("Tom", Integer.MAX_VALUE + 1);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase12() {
        try {
            r.addMember("Tom", Integer.MAX_VALUE - 1);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testcase13() {
        try {
            r.addMember("", 2);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase14() {
        try {
            r.addMember("Qaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 4);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testcase15() {
        try {
            r.addMember("Qaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 5);
            fail();
        } catch (Exception e) {
        }
    }

    @Test
    public void testcase16() {
        try {
            r.addMember("Qaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 6);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testcase17() {
        try {
            r.addMember("Tom", 1);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }*/
}