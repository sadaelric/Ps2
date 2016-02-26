package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	static MyInteger inta1;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		inta1 = new MyInteger(3);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	@Test
	public void test1() {
		
		MyInteger myInt3 = new MyInteger(3);
		MyInteger myInt4 = new MyInteger(4);
		
		assertTrue(myInt3.isOdd() == true);
		assertFalse(myInt4.isOdd() == true);
		
	}
	@Test
	public void test2() {
		MyInteger myInt6 = new MyInteger(6);
		MyInteger myInt7 = new MyInteger(7);
		
		assertTrue(myInt6.isEven() == true);
		assertFalse(myInt7.isEven() == true);
	}
	@Test
	public void test3() {
		MyInteger myInt7 = new MyInteger(7);
		MyInteger myInt8 = new MyInteger(8);
		
		assertTrue(myInt7.isPrime() == true);
		assertFalse(myInt8.isPrime() == true);
	}
	@Test
	public void test4(){
assertTrue(MyInteger.isOdd(9));
assertFalse(MyInteger.isEven(9));
assertTrue(MyInteger.isPrime(7));  
assertTrue(MyInteger.isEven(10));
assertFalse(MyInteger.isOdd(8));
assertFalse(MyInteger.isPrime(4));
	}
	}
