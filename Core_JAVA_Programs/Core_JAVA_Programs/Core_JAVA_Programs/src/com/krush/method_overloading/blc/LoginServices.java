package com.krush.method_overloading.blc;

public class LoginServices {
	
	public void login(String emailId, String password ) 
	{
		
		
		if(emailIdValidation(emailId)&&  validationPassword(password))
		{
			System.out.println("Success fully Logined With Email..");
		}else
			System.err.println(" <!>Invalid Email or Password Please Enter Valid....");
		
	}
	
	public void login(String mobileNo , int OTP) {
		
		     if(mobileNumberValidation(mobileNo)&& OTPValidation(OTP)) {
		    	 
		    	 System.out.println("Success fully Logined With MobileNumber..");
				}else
					System.err.println(" <!>Invalid MobileNumber or OTP Please Enter Valid....");
				
	}
	
	public void login(String provider) {
		
		if(provider.equalsIgnoreCase("google"))
		System.out.println("Logined Sucessfully with provider Account :"+provider+" ....");
		else System.err.println("Please Select valid Platform (hint: google)");
	}
	
	
	
	private  boolean  emailIdValidation(String emailId)
	{
		if(emailId.contains("gmail.com")) {
			return true;
		}
		return false;
		
	}
     private boolean validationPassword(String password) 
     {
    	  if(password.equals("MOL3")) {
    		  
    		return true;
    	  }
    	 
    	return false;
     }
     
     
    private boolean mobileNumberValidation( String mobileNo) {
    	
    	if(mobileNo.length()==10) {
    		return true;
    	}else return false;
    }
    private boolean OTPValidation(int OTP) {
    	if(OTP==1111) {
    		return true;
    	}else 
    		return false;
    }
}
