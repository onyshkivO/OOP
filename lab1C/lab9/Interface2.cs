using lab1C.lab8;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1C.lab9
{
    interface Interface2
    {
         string calculateAndGetType<T1, T2 >(T1 t1, T2 t2) where T1 : Body where T2: Body;
    }
}
