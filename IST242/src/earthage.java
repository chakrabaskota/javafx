//Name: Kamal Dangal
//Program Purpose: GUI Project 4     
/********************************/

import java.util.*;

public class earthage
{    
   //variable declaration
  private static final int MercuryYear = 88;
  private static final int VenusYear = 225;
  private static final int JupiterYear = 4380;
  private static final int SaturnYear = 10767;
  private static final int EarthYear = 365;
  
  //main function
  public static void main(String[] args)
  {
	  Scanner input = new Scanner(System.in);
	  
    //Variable declaration 
	  
    int ageEarth,ageMercury, ageVenus, ageJupiter, ageSaturn;
    
    //Get the input
    System.out.println("Enter your age on Earth");
    ageEarth = input.nextInt();
    
  
    /* Convert the Earth age to the corresponding age on the other planets */
        ageMercury = (ageEarth * EarthYear)/MercuryYear;
        ageVenus = (ageEarth * EarthYear)/VenusYear;
        ageJupiter = (ageEarth * EarthYear)/JupiterYear;
        ageSaturn = (ageEarth * EarthYear)/SaturnYear;
    
   System.out.println("your age on Mercury is "+ageMercury);
   System.out.println("your age on Venus is "+ageVenus);
   System.out.println("your age on Jupiter is "+ageJupiter);
   System.out.println("your age on Saturn is "+ageSaturn);
   
    
    }
    
 }  