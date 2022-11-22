
#include<stdlib.h>
#include <stdio.h>
struct Node{
    int data;
    struct Node* next;
};
typedef struct Node* node;
node createNode(node temp,int data){
    temp=(struct Node*)malloc(sizeof(struct Node));
    temp->data=data;
    temp->next=NULL;
    return temp;
}
void display(node head){
    node temp=head;
    while(temp!=NULL){
        printf("%d\n",temp->data);
        temp=temp->next;
    }
    printf("===========================================\n");
}
void insertEnd(node *head,int data){
    node temp=createNode(temp,data);
    if(*head==NULL)
        *head=temp;
    else{
    node ptr=*head;
    while(ptr->next!=NULL){
        ptr=ptr->next;
    }
    ptr->next=temp;
    }        
}
void insertBegin(node *head,int data){
    node temp=createNode(temp,data);
    if(*head==NULL)
        *head=temp;
    else{
        node ptr=*head;
        temp->next=ptr;
        *head=temp;
    }
}
void insertAtIndex(node *head,int index,int data){
    node temp=createNode(temp,data);
    if(*head==NULL){
        *head=temp;
        return;
    }
    int i=0;
    node ptr=*head;
    node prev;
    
    while(i!=index-1){
        prev=ptr;
        ptr=ptr->next;
        i++;
    }
    prev->next=temp;
    temp->next=ptr;
}
void deleteBegin(node *head){
    node temp=*head;
    if(temp==NULL)
    {
        printf("Empty");
        return;
    }
    if(temp->next==NULL){
        *head=NULL;
        free(temp);
    }
    else{
        *head=temp->next;
        temp=NULL;
        free(temp);
    }
    
}
void deleteEnd(node *head){
     node temp=*head;
    if(temp==NULL)
    {
        printf("Empty");
        return;
    }
    if(temp->next==NULL){
        *head=NULL;
        free(temp);
    }
    else{
        node prev=temp;
        temp=temp->next;
        while(temp->next!=NULL){
            prev=temp;
            temp=temp->next;
        }
        prev->next=NULL;
        temp=NULL;
        free(temp);
    }
}
void deleteAt(node *head,int index){
    node prev=*head;
    node ptr=prev->next;
    for(int i=1;i<index;i++){
        prev=prev->next;
        ptr=ptr->next;
    }
    prev->next=ptr->next;
    ptr=NULL;
    free(ptr);
  
}
int main()
{
    // node head=NULL;
    node head=createNode(head,1);
    head->next=createNode(head->next,2);
    insertEnd(&head,3);
    insertBegin(&head,4);
    insertAtIndex(&head,3,6);//Not applicable for first node
    display(head);
    deleteBegin(&head);
    display(head);
    deleteEnd(&head);
    display(head);
    deleteAt(&head,1);
    display(head);
    return 0;
}
