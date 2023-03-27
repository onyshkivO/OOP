using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1C.lab4
{
    class Date
    {
        private int day;
        private int month;
        private int year;
        private Dictionary<int, string> map;

        public Date(int day, int month, int year)
        {
            init(day, month, year);
            initMap();
        }

        public Date()
        {
            this.day = 1;
            this.month = 1;
            this.year = 2000;
            initMap();
        }


        private void initMap()
        {

            map = new Dictionary<int, string>();
            map.Add(1, "січня");
            map.Add(2, "лютого");
            map.Add(3, "березня");
            map.Add(4, "квітня");
            map.Add(5, "травня");
            map.Add(6, "червня");
            map.Add(7, "липня");
            map.Add(8, "серпня");
            map.Add(9, "вересня");
            map.Add(10, "жовтня");
            map.Add(11, "листопада");
            map.Add(12, "грудня");
        }

        public void init(int day, int month, int year)
        {
            if (!validateDay(day)) day = 1;
            this.day = day;
            if (!validateMonth(month)) month = 1;
            this.month = month;
            this.year = year;
        }
        public void read()
        {
            Console.Write("Input day: ");
            int day = Convert.ToInt32(Console.ReadLine());
            Console.Write("Input month: ");
            int month = Convert.ToInt32(Console.ReadLine());
            Console.Write("Input year: ");
            int year = Convert.ToInt32(Console.ReadLine());
            init(day, month, year);
        }
        public void display()
        {
            Console.WriteLine("{0:D2}.{1:D2}.{2}", day, month, year);
        }
        public void displayText()
        {
            Console.WriteLine("{0:D2} {1} {2} року", day, map[month], year);
        }

        private bool validateDay(int day)
        {
            return day > 0 && day < 32;
        }

        private bool validateMonth(int month)
        {
            return month > 0 && month < 13;
        }

        

        public int getDay()
        {
            return day;
        }

        public int getMonth()
        {
            return month;
        }

        public int getYear()
        {
            return year;
        }

        public void setDay(int day)
        {
            if (validateDay(day)) day = 1;
            this.day = day;
        }

        public void setMonth(int month)
        {
            if (validateMonth(month)) month = 1;
            this.month = month;
        }

        public void setYear(int year)
        {
            this.year = year;
        }
    }
}
