package com.wkp.common.utils;



import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		
		System.out.println(RandomUtil.random(2, 5));
	}

	@Test
	public void testSubRandom() {
		
		int[] subRandom = RandomUtil.subRandom(1,10,4);
		
		for (int i : subRandom) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		System.out.println(RandomUtil.randomCharacter());
	}

	@Test
	public void testRandomString() {
		System.out.println(RandomUtil.randomString(5));
	}

}
