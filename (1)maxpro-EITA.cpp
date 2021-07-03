//maximum production
//code-EITA
#include<iostream>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int d,x,y,z;
        cin>>d>>x>>y>>z;

        int dx=x*7;
        int dy=y*d+z*(7-d);
        int m=max(dx,dy);
        cout<<m<<endl;
    }
    return 0;
}