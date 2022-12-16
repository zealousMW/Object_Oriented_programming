#include<stdio.h>
 
int main()
{
    int i,j,n,loc,temp,min;
    int a[] = {20, 12, 10, 15, 2};
    int a2[] = {20, 12, 10, 15, 2};
   n = sizeof(a) / sizeof(a[0]);
 
    for(i=0;i<n-1;i++)
    {
        min=a[i];
        loc=i;
        for(j=i+1;j<n;j++)
        {
            if(min>a[j])
            {
                min=a[j];
                loc=j;
            }
        }
 
        temp=a[i];
        a[i]=a[loc];
        a[loc]=temp;
    }
 
    printf("\nselection Sorted list is as follows\n");
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }

    for(i=1;i<=n-1;i++)
    {
        temp=a2[i];
        j=i-1;
 
        while((temp<a2[j])&&(j>=0))
        {
            a2[j+1]=a2[j];    //moves element forward
            j=j-1;
        }
 
        a2[j+1]=temp;    //insert element in proper place
    }
    printf("\n insertion Sorted list is as follows\n");
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
 
    return 0;
}