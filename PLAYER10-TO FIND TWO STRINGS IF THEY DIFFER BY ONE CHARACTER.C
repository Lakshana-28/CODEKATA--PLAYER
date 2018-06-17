#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char a[100],b[100];
    int i,l1,l2,cnt=0;
    scanf("%s",a);
    l1=strlen(a);
    scanf("%s",b);
    l2=strlen(b);
    if(l1==l2)
    {
        for(i=0;i<l1;i++)
    {

            if(a[i]!=b[i])
            {
                cnt++;
            }

    }
    }
    if(cnt==1)
    {
        printf("they differ my one character");
    }
    else{
        printf("they dont differ by one character");
    }
}
