#include<stdio.h>
struct pro
{
int P,AT,BT,ST,FT,WT,TAT;
}pro[100];
int main()
{
int i,n;
printf("Enter No Of Process:");
scanf("%d",&n);
printf("\nEnter Arrival Time of %d Process:",n);
for(i=1;i<=n;i++)
{
	pro[i].P=i;
	printf("\n\tP%d=",i);
	scanf("%d",&pro[i].AT);
}
printf("Enter Burst Time of %d Process:",n);
for(i=1;i<=n;i++)
{
	pro[i].P=i;
	printf("\n\tP%d=",i);
	scanf("%d",&pro[i].BT);
}

for(i=0;i<=n;i++)
{
	if(pro[i].AT > pro[i+1].AT)
	{
		pro[50]=pro[i];
		pro[i]=pro[i+1];
		pro[i+1]=pro[50];
	}
}
pro[0].ST=pro[0].AT;
for(i=1;i<=n;i++)
{
	pro[i].ST=pro[i-1].ST+pro[i-1].BT;
	pro[i].FT=pro[i].ST+pro[i].BT;
	pro[i].WT=pro[i].ST-pro[i].AT;
	pro[i].TAT=pro[i].FT-pro[i].AT;
}

printf("\n\t**********GANTT CHART*************\n\t");
for(i=1;i<=n;i++)
printf("|p%d",i);
printf("|\n\t%d",pro[0].ST);
for(i=1;i<=n;i++)
{
printf("  %d",pro[i].FT);
}
}