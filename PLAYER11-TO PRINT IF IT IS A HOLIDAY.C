#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char a[100];
    int i,l,cnt=0;
    scanf("%s",a);
    l=strlen(a);
    for(i=0;i<l;i++)
    {
   if(a[i]=='S'||a[i]=='a'||a[i]=='t'||a[i]=='u'||a[i]=='r'||a[i]=='d'||a[i]=='a'||a[i]=='y'||a[i]=='n')
   {
      cnt++;
   }
    }
    if(cnt==8||cnt==6)
    {
        printf("holiday");
    }
   else{
    printf("not holiday");
   }
}
