/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dong.util;

/**
 *
 * @author DELL
 */
// day la class chua cac ham toan hoc ta tu viet, muc dich la cong cu xai chung cho moi noi. Pham cai gi ma dc thiet de xai chung
// ta dung ki thuat STATIC
public class MathUtil {
    
    //tinh n! = 1.2.3....n vi n! thang rat nhanh, se tran int som
    //int chi luu dc toi da 2 ty 1, nen minh xai long an toan hon
    //15! to lam roi, tinh toi da 15!
    public static long computeFactorial(int n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
