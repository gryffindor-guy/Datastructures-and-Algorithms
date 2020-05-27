#include <iostream>
#include <string>

using namespace std;
string ReverseTheInputString(string Mystring){
  string Reversed_String="";
  for (int i=Mystring.size();i>=0;i--){
    Reversed_String = Reversed_String+Mystring[i];
  }
  return Reversed_String;
}

int main() {
  string Mystring="Hello This is Hemanth";
  string Reversed_string=ReverseTheInputString(Mystring);
  cout<<Reversed_string<<endl;
}