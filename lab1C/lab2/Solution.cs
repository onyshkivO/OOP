using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1C.lab2
{
    class Solution
    {
        private  struct StudentStruct {
            public String secondName;
            public int course;
            public String specialty;
            public int mathGrade;
            public int physicsGrade;
            public int computerScienceGrade;
        }
        private static Random rnd = new Random();
        static void Main(string[] args)
        {
            third();
        }
        //firts
        public static void first()
        {
            int[] b = new int[21];
            create(b);
            print(b);
            Array.Sort(b);
            print(b);
            calculateAndReplace1D(b);

        }

        private static void create(int[] b)
        {
            for (int i = 0; i < 21; i++)
            {
                b[i] = rnd.Next(10, 91);
            }
        }

        private static void calculateAndReplace1D(int[] b)
        {
            int sum = 0;
            int count = 0;
            for (int i = 0; i < 21; i++)
            {
                if (b[i] % 2 != 0 && b[i] % 3 == 0) continue;
                count++;
                sum += b[i];
                b[i] = 0;
            }
            print(b);
            Console.WriteLine(sum);
            Console.WriteLine(count);
        }

        private static void print(int[] b) {
            foreach (int item in b)
            {
                Console.Write(item.ToString()+" ");
            }
            Console.WriteLine();
        }
        //second
        public static void second()
        {
            int rows = 8;
            int cols = 5;
            int[,] matrix = new int[rows,cols];
            create(matrix);
            print2D(matrix);
            Console.WriteLine("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            sort(matrix);
            print2D(matrix);
            Console.WriteLine("~~~~~~~~~~~~~~~~~~~~~~~~~~");

            calculateAndReplace2D(matrix);
        }

        private static void print2D(int[,] matrix)
        {
            for (int i =0; i< matrix.GetLength(0);i++)
            {
                for (int j = 0; j < matrix.GetLength(1); j++) {
                    Console.Write(matrix[i,j].ToString() + "\t");
                }
                Console.WriteLine();
            }
        }

        private static void create(int[,] matrix)
        {
            for (int i = 0; i < matrix.GetLength(0); i++)
            {
                for (int j = 0; j < matrix.GetLength(1); j++)
                {
                    matrix[i,j] = rnd.Next(4, 52);
                }
            }
        }

        private static void calculateAndReplace2D(int[,] matrix)
        {
            int sum = 0;
            int count = 0;
            for (int i = 0; i < matrix.GetLength(0); i++)
            {
                for (int j = 0; j < matrix.GetLength(1); j++)
                {
                    if (matrix[i,j] % 2 != 0 || (i % 3 == 0 && j % 3 == 0)) continue;
                    count++;
                    sum += matrix[i,j];
                    matrix[i,j] = 0;
                }
            }
            print2D(matrix);
            Console.WriteLine("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            Console.WriteLine(sum);
            Console.WriteLine(count);
        }

        private static void sort(int[,] matrix)
        {
            for (int i0 = 0; i0 < matrix.GetLength(0) - 1; i0++)
                for (int i1 = 0; i1 < matrix.GetLength(0) - i0 - 1; i1++)
                    if ((matrix[i1,0] > matrix[i1 + 1,0])
                            ||
                            (matrix[i1,0] == matrix[i1 + 1,0] &&
                                    matrix[i1,1] < matrix[i1 + 1,1])
                            ||
                            (matrix[i1,0] == matrix[i1 + 1,0] &&
                                    matrix[i1,1] == matrix[i1 + 1,1] &&
                                    matrix[i1,2] < matrix[i1 + 1,2]))
                        change(matrix, i1, i1 + 1, matrix.GetLength(1));
        }

        private static void change(int[,] matrix, int row1, int row2, int colCount)
        {
            int tmp;
            for (int j = 0; j < colCount; j++)
            {
                tmp = matrix[row1,j];
                matrix[row1,j] = matrix[row2,j];
                matrix[row2,j] = tmp;
            }
        }
        //third
        private static  void third()
        {
            StudentStruct[] students = new StudentStruct[4];
            students[0] = new StudentStruct();
            students[0].secondName = "Торба";
            students[0].course = 1;
            students[0].specialty = "Комп'ютернi науки";
            students[0].mathGrade = 4;
            students[0].physicsGrade = 5;
            students[0].computerScienceGrade = 2;

            students[1] = new StudentStruct();
            students[1].secondName = "Куля";
            students[1].course = 3;
            students[1].specialty = "Фiзика";
            students[1].mathGrade = 5;
            students[1].physicsGrade = 5;
            students[1].computerScienceGrade = 5;

            students[2] = new StudentStruct();
            students[2].secondName = "Штрик";
            students[2].course = 2;
            students[2].specialty = "Математики";
            students[2].mathGrade = 3;
            students[2].physicsGrade = 3;
            students[2].computerScienceGrade = 3;

            students[3] = new StudentStruct();
            students[3].secondName = "Дрiт";
            students[3].course = 1;
            students[3].specialty = "Математики";
            students[3].mathGrade = 3;
            students[3].physicsGrade = 4;
            students[3].computerScienceGrade = 4;
            printstruct(students);
            int superGrade = superGradeCounter(students);
            Console.WriteLine("Students that have super grade: " + superGrade);

        }
        private static int superGradeCounter(StudentStruct[] students)
        {
            int counter = 0;
            foreach (StudentStruct student in students)
            {
                if (student.mathGrade == 5 && student.physicsGrade == 5 && student.computerScienceGrade == 5) counter++;
            }
            return counter;
        }
        private static void printstruct(StudentStruct[] students)
        {
            Console.WriteLine("|{0,15:s} |{1,7:s} |{2,20:s} |{3,10:s} |{4,13:s}|{5,20:s} |", "secondName", "course", "specialty", "mathGrade", "physicsGrade", "computerScienceGrade");
            Console.WriteLine("-------------------------------------------------------------------------------------------------");
            foreach (StudentStruct student in students)
            {
                Console.WriteLine("|{0,15:s} |{1,7:d} |{2,20:s} |{3,10:d} |{4,13:d}|{5,20:d} |", student.secondName, student.course, student.specialty
                        , student.mathGrade, student.physicsGrade, student.computerScienceGrade);
            }
            Console.WriteLine("-------------------------------------------------------------------------------------------------");
        }


    }
}
