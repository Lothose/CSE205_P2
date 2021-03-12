/********************************************************************************************************* 
 * CLASS: OnCampusStudent (OnCampusStudent.java) 
 * 
 * DESCRIPTION 
 * Provides programming for on campus student tuition
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
     * OnCampusStudent extends the super class Student and overrides calcTuition if the sub class OnCampusStudent is called.
     * Calculates tuition for OnCampusStudents and adds a program fee
     */
public class OnCampusStudent extends Student {
	public static final int RESIDENT = 1;
	public static final int NON_RESIDENT = 2;
	private int mResident;
	private double mProgramFee;
	
	public OnCampusStudent(String pId, String pFirstName, String pLastName) {
		super(pId,pFirstName,pLastName);
	}
	
	@Override
    public void calcTuition() {
		double t;
		
		if (getResidency() == RESIDENT) {
			t = TuitionConstants.ONCAMP_RES_BASE;
		} else {
			t = TuitionConstants.ONCAMP_NONRES_BASE;
		}
		
		t += getProgramFee();
		
		if (getCredits() > TuitionConstants.ONCAMP_MAX_CREDITS) {
			t = ((getCredits() - TuitionConstants.ONCAMP_MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS);
		}
		setTuition(t);
    }
	
	public double getProgramFee() {
		return mProgramFee;
	}
	
	public int getResidency() {
		return mResident;
	}
	
	public void setProgramFee(double pProgramFee) {
		mProgramFee = pProgramFee;
	}
	
	public void setResidency(int pResident) {
		mResident = pResident;
	}
}
