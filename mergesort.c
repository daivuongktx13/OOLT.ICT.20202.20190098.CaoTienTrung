#include <stdio.h>
#define SIZE 10
void merge(int a[],int p,int q,int r){
	int temp[SIZE];
	int first1=p,last1=q;
	int first2=q+1,last2=r;
	int index=p;
	while(first1<=last1&&first2<=last2){
		if(a[first1]<a[first2]){
			temp[index]=a[first1];
			first1++;
		}else{
			temp[index]=a[first2];
			first2++;	
		}
		index++;
	}
	while(first1<=last1){
		temp[index]=a[first1];
		index++;
		first1++;
	}
	while(first2<=last2){
		temp[index]=a[first2];
		index++;
		first2++;
	}
	int i;
	for(i=p;i<=r;i++) a[i]=temp[i];
}
void mergesort(int a[],int p,int r){
	
	if(p<r){
	int q;
	q=(p+r)/2;
	mergesort(a,p,q);
	mergesort(a,q+1,r);
	merge(a,p,q,r); 
	}
}
int main(){
	int a[10]={1,9,9,9,8,2,5,4,1,5};
	int i;
	mergesort(a,0,9);
	for(i=0;i<=9;i++){
		printf("%d ",a[i]);
	}
}
