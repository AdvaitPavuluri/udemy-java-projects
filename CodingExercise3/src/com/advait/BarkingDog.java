package com.advait;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking,int hourOfDay)
    {
        if(hourOfDay >= 0 && hourOfDay <= 23){
            if((barking && hourOfDay < 8) || (barking && hourOfDay > 22))
            {
                return true;
            }
        }else if(hourOfDay < 0 || hourOfDay > 23)
        {
            return false;

        }
        {
            return false;
        }

    }
}