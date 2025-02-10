#include<stdio.h>
struct pro
{
int P,AT,BT,ST,FT,WT,TAT;
}pro[100];
int main()
{
int i,j,n;
printf("Enter No Of Processes:");
scanf("%d",&n);
printf("Enter Arrival Time Of %d Processes:",n);
for(i=1;i<=n;i++)
{
	pro[i].P=i;
	printf("\n\tP%d",i);
	scanf("%d",&pro[i].AT);
}
printf("Enter Burst Time Of %d Processes:",n);
for(i=1;i<=n;i++)
{
	pro[i].P=i;
	printf("\n\tP%d",i);
	scanf("%d",&pro[i].BT);
}
for(j=1;j<=n;j++)
{
	for(i=1;i<=j;i++)
	{
		if(pro[i].AT>pro[j].AT || pro[i+1].BT>pro[j+1].BT)
		{
			pro[50]=pro[i];
			pro[i]=pro[j];
			pro[j]=pro[50];
		}
	}
}	
for(j=2;j<=n;j++)
{
	for(i=2;i<=j;i++)
	{
		if(pro[i].BT>pro[j].BT)
		{
			pro[50]=pro[i];
			pro[i]=pro[j];
			pro[j]=pro[50];
		}
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
printf("\n\t******************GANTT CHART****************\n\t");
for(i=1;i<=n;i++)
printf("|P%d ",pro[i].P);
printf("|\n\t%d",pro[0].ST);
for(i=1;i<=n;i++)
printf("   %d",pro[i].FT);
printf("\n\t**************PROCESS TABLE****************\n");

for(j=1;j<=n;j++)
{
	for(i=1;i<=j;i++)
	{
		if(pro[i].P>pro[j].P)
		{
			pro[50]=pro[i];
			pro[i]=pro[j];
			pro[j]=pro[50];
		}
	}
}
printf("\n\tProcess\tAT\tBT\tST\tFT\tWT\tTAT");
for(i=1;i<=n;i++)	
printf("\n\tP%d\t%d\t%d\t%d\t%d\t%d\t%d",pro[i].P,pro[i].AT,pro[i].BT,pro[i].ST,pro[i].FT,pro[i].WT,pro[i].TAT);

}