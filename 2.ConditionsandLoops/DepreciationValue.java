package com.ConditionsandLoops;

//Calculate Depreciation of Value  v2=v1[1-r/100]

public class DepreciationValue {
    static float Depreciation(float v,
                              float r, float t)
    {
        float D = (float)(v * Math.pow((1 - r / 100), t));

        return D;
    }

    // Driver code
    public static void main(String[] args)
    {
        float V1 = 200, R = 10, T = 2;

        System.out.print(Depreciation(V1, R, T));
    }
}
