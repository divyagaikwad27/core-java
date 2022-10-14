package com.testing.mavenproject;


import java.util.List;



public class MockitoEx {

	public static void main(String[] args) 
	{
		@Test
		
		  public Object testObject
		  {
		    List<String> mockList = mock(List.class);
		    mockList.add("First");
		    when(mockList.get(0)).thenReturn("Mockito");
		    when(mockList.get(1))).thenReturn("JCG");
		    assertEquals("Mockito", mockList.get(0));
		    assertEquals("JCG", mockList.get(1));
		  }

	}

	private static void assertEquals(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	private static Object when(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static List<String> mock(Class<List> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void openMocks(ApplicationTest applicationTest) {
		// TODO Auto-generated method stub
		
	}

}
