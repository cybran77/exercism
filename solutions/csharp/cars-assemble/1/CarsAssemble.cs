static class AssemblyLine
{
    public static double SuccessRate(int speed)
    {
        if (speed == 10) return 0.77;
        if (speed == 9) return 0.8;
        if (speed >= 5) return 0.9;
        if (speed >= 1) return 1.0;
        return 0.0;
    }
    
    public static double ProductionRatePerHour(int speed)
    {
        return SuccessRate(speed) * speed * 221.0;
    }

    public static int WorkingItemsPerMinute(int speed)
    {
        return (int)(ProductionRatePerHour(speed) / 60);
    }
}
