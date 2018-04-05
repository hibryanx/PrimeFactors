package primeFactors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zlx
 * @Description: 求质因数
 * @date 2018年4月5日 下午4:57:09
 */
public class PrimeFactors {
	
	/**
	 * 求质因数
	 * @param n
	 * @return
	 */
	public static List<Integer> generate(int n){
		List<Integer> primes = new ArrayList<>();
		for(int candidate = 2; n > 1; candidate++){
			for(; n % candidate == 0; n/=candidate){
				primes.add(candidate);
			}
		}
		return primes;
	}


}
