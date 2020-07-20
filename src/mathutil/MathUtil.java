/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static dong.util.MathUtil.computeFactorial;
/**
 *
 * @author DELL
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("5! = " + computeFactorial(5));
        //tui muon biet xem 5! chay dung ko
        //vay tui in ket qua xu li cua ham ra (actual value)
        //tui so sanh no coi co bang 120 ma tui tinh truoc ko (expected value)
        //neu ham co 1 value tra ve (actual - gia su 120)
        //va khop voi cai tui can no phai the (expected - gia su minh can ham tra ve 120)
        //actual khop voi expected, ham chay nhu mong doi, ham chay dung
        //testing chang qua la chay app, chay ham, coi ket qua tra ve co dung nhu
        //minh mong doi hay ko - actual va expected la nhu nhau
        //neu ko khop, code co bug, hoac minh ki vong sai
        
        //expected: 720 moi chiu
        System.out.println("6! = " + computeFactorial(6));

        //exxpected: 1 moi chiu 
        System.out.println("1! = " + computeFactorial(1));
        
        //expected: 1 moi chiu
        System.out.println("0! = " + computeFactorial(0));
        
        //cach test kieu nay phai 
        //>chuan bi data dau vao
        //>goi ham voi data dau vao
        //> tinh truoc kq tra ve (expected)
        //> so sanh kq tra ve tu ham (actual) voi expected = mat
        //tu dua ra ket luan -> luan ham bang mat

        //expected : Exception
        System.out.println("-5! = " + computeFactorial(-5));
        
        //ki thuat dung mat doi chieu ket ON, NHUNG KO HIEU QUA
        //vi may co the doi chieu kq dc luon ma, may so dc expected va actual ma
        //GIANG HO DUA RA ! BO THU VIEN, 1 FRAMEWORK GIUP MINH
        //TU DONG SO SANH 2 KET QUA EXPECTED VA ACTUAL
        //framework nay se tu so sanh va dua ra mau sac de ham y rang
        //ham chay dung, mau xanh
        //ham chay sai, ko nhu ki vong, mau do
        //ap dung cho 1 loat data dau vao
    }
    
}
