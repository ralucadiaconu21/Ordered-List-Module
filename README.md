# Ordered-List-Module

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
This project contains two Linked Lists that optimally add or remove elements. Both lists accept any type of data as elements.
	
## Technologies
Project is created with:
* Java
	
## Setup
To run this project, 

## Features
* QuickPopOrderedList optimally removes elements. The sorting logic is included in the Push method.
* QuickPushOrderedList optimally adds elements. The sorting logic is included in the Pop method.
* Display the content of the lists.

## Class Diagram
```mermaid
---
title: Ordered List Class Diagram
---

classDiagram
	OptimizedLinkedList <|-- OptimizedList
	OptimizedLinkedList o-- LinkedListNode
	QuickPushOrderedList <|-- OptimizedLinkedList
	QuickPopOrderedList <|-- OptimizedLinkedList
	QuickPopOrderedIntegerList <|-- QuickPopOrderedList
	QuickPushOrderedIntegerList <|-- QuickPushOrderedList
	
	class OptimizedList {
		+pop()*
		+push()*
	}
	class LinkedListNode {
		+T value
		+LinkedListNode next
		+LinkedListNode prev
	}
	class OptimizedLinkedList {
		+LinkedListNode head
		+Integer length
		+pop()*
		+push()*
		+displayList()
	}
	
	class QuickPushOrderedList {
		+pop()
		+push()
		+compare()*
	}
	
	class QuickPopOrderedList {
		+pop()
		+push()
		+compare()*
	}
	
	class QuickPushOrderedIntegerList {
		+compare()
	}
	
	class QuickPopOrderedIntegerList {
		+compare()
	}
```
