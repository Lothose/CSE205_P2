/********************************************************************************************************* 
 * CLASS: OnlineStudent (OnlineStudent.java) 
 * 
 * DESCRIPTION 
 * Provides programming for online student tuition
 * 
 * 
 * COURSE AND PROJECT INFORMATION 
 * CSE205 Object Oriented Programming and Data Structures, Spring 2021
 * Project Number: p2
 *
 * GROUP INFORMATION  
 * AUTHOR 1: Brandon Murata, bmurata1, bmurata1@asu.edu
 * AUTHOR 2: Brandon Billmeyer, bbillmey , bbillmey@asu.edu
 * AUTHOR 3: Delaney Claussen , djclaus1, djclaus1@asu.edu
 * AUTHOR 4: Taylor Hedrick, tmhedric, tmhedric@asu.edu
 ********************************************************************************************************/
    /**
     * OnlineStudent extends the super class Student and overrides calcTuition if the sub class OnlineStudent is called.
     * Calculates tuition for OnlineStudents and adds TechFee
     */
public class OnlineStudent extends Student {
	private boolean mTechFee;
	
	public OnlineStudent(String pId, String pFirstName, String pLastName) {
		super(pId,pFirstName,pLastName);
	}
	
	@Override
    public void calcTuition() {
		double t = getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;
		
		if (getTechFee() == true) {
			t += TuitionConstants.ONLINE_TECH_FEE;
		}
		
		setTuition(t);
    }
	
	public boolean getTechFee() {
		return mTechFee;
	}
	
	public void setTechFee(boolean pTechFee) {
		mTechFee = pTechFee;
	}
	

		
}
