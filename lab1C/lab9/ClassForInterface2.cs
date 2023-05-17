using lab1C.lab8;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1C.lab9
{
    class ClassForInterface2
    {
        public string calculateAndGetType<T1, T2>(T1 t1, T2 t2) where T1 : Body where T2 : Body
        {
            Type tp1 = typeof(T1);
            Type tp2 = typeof(T2);
            string result = $"t1: {t1}, Type t1: {tp1.ToString()}\n" +
                            $"t2: {t2}, Type t2: {tp2.ToString()}\n" +
                            $"t1 area = {t1.FindArea()}\n" +
                            $"t1 volume = {t1.FindVolume()}\n" +
                            $"t2 area = {t2.FindArea()}\n" +
                            $"t2 volume = {t2.FindVolume()}\n";

            return result;
        }
    }
}
