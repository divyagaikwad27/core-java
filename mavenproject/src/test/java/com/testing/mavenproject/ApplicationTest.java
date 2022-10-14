package com.testing.mavenproject;
	public class ApplicationTest 
	{
		
		{
			@InjectMocks
			MainClass mainClass;

			@Mocks
			DatabaseDAO dependentClassOne;

			@Mocks
			NetworkDAO dependentClassTwo;

			@Before
		    public void  init()
			{
				MockitoEx.openMocks(this);
			}
		
			@Test
			public void validateTest()
			{
		                //record expectations with mock methods
		                when(dependentClassOne.save("sdfffg")).thenReturn(true);
		                when(dependentClassTwo.save("sdfffg")).thenReturn(true);
			
				boolean saved = mainClass.save("E:/file/test.txt");
				assertEquals(true, saved);
			}
		                //verify recorded expectations
		}

		
	}
