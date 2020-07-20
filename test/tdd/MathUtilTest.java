/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import dong.util.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MathUtilTest {
    
    //day la class db, chua cac ham, ma moi ham dung de test cac ham ben class 
    //cua du an, vi du test cF() coi chay dung ko
    //moi~ ham se~ chay 1 hoac nhieu lenh cF() tuy ban, de kiem tra coi
    //actual co khop voi expected hay ko
    //khop, nem ra mau xanh
    //khong khop, nem ra mau do
    //moi ham se la 1 ham main() neu no mang phia truoc 1 ki hieu
    //@Test - goi la annotation

    /**
     *
     */
    @Test
    public void testSuccessfulCases(){
        //ham nay goi nhung cF() ma tra ve ket qua giai thua
        //assertEquals(120, 720);
        
        //expected 1, actual: cho tinh toan khi chay ham
        assertEquals(1, MathUtil.computeFactorial(1));
        
        //expected 1, actual: cho tinh toan khi chay ham
        assertEquals(1, MathUtil.computeFactorial(0));
        
        assertEquals(2, MathUtil.computeFactorial(2));

        
        assertEquals(6, MathUtil.computeFactorial(3));

        assertEquals(720, MathUtil.computeFactorial(6));

        
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases(){
        //ham nay test nhung tinh huong cà chớn
        //nguoi dung dua 5!, tinh the nao dc
        //ham cF() phai nem ve ngoai le, mot tinh huong bat thuong,
        //mot Exception
        //khon nan, Exception ko phai la value de assert()
        //ta phai dung 1 chieu khac
        MathUtil.computeFactorial(-5); //ko xai assertEquals()
        //dua -5 vao tham so, minh (dv tk ra ham cF() coi day la ca chon)
        //dap vao mat nguoi dua con so -5 nay vao
        //bang cach nem ra ngoai le IllegalArgumentException
    }
    
}
//do: chi can 1 thang do, la coi nhu ca dam do, ham chay dung hau het
//cac cases, nhung chi 1 tinh huong sai, coi nhu ham sai
//xanh: tat ca phai xanh, ham y ham dung cho moi tinh huong