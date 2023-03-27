using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1C.lab4
{
    class Main1
    {
        static void Main() {
            Date date = new Date(1, 2, 2022);
            date.display();
            date.displayText();
            date.read();
            date.display();
            date.displayText();
        }

    }
}
