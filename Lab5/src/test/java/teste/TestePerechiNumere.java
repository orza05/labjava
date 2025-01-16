package teste;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import ex3.PerecheNumere;
public class TestePerechiNumere {
    @Test
    void test1_sumaegala() {
        PerecheNumere p=new PerecheNumere(4,5);
        assertEquals( p.sumaegala(),true);
    }
    @Test
    void test2_sumaegala() {
        PerecheNumere p=new PerecheNumere(2,2);
        assertTrue(p.sumaegala()==true);
    }
    @Test
    void test3_sumaegala() {
        PerecheNumere p=new PerecheNumere(3,7);
        assertFalse(p.sumaegala()==false);
    }

    @Test
    void test1_fibo() {
        PerecheNumere p=new PerecheNumere(4,5);
        assertEquals( p.fibo(),true);
    }
    @Test
    void test2_fibo() {
        PerecheNumere p=new PerecheNumere(2,2);
        assertTrue(p.fibo()==true);
    }
    @Test
    void test3_fibo() {
        PerecheNumere p=new PerecheNumere(3,7);
        assertFalse(p.fibo()==false);
    }

}
