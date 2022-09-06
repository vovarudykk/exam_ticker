package exam_ticket_2;

public class CustomData {
    private int year;
    private int month;
    private int day;

    public CustomData(int year, int month, int day) throws CustomException {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    public void setYear(int year) throws CustomException {
        if(1 <= year && year <= 2013) {
            this.year = year;
        }
        else {
            throw new CustomException("Year must be between 1 and 2013");
        }
    }

    public void setMonth(int month) throws CustomException {
        if(1 <= month && month <= 12) {
            this.month = month;
        }
        else {
            throw new CustomException("Month must be between 1 and 12");
        }
    }

    public void setDay(int day) throws CustomException {
        if(1 <= day && day <= 31) {
            this.day = day;
        }
        else {
            throw new CustomException("Day must be between 1 and 31");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void print() {
        System.out.println("Data[" + getYear() + "|" +
                getMonth() + "|" +
                getDay() + "]");
    }
}
