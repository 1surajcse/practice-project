package com.designPatterns;
/***
 * In Factory pattern we create the object without exposing the creation logic to the client and refer to a newly created object 
 * with a common interface.This pattern provides loose coupling.
 * 
 * Example:
 * 1) valueOf() method which returns the object created by factory equivalent to parameter passed.
 * 
 * 
 * 
 * @author stiwari
 *
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		String type="Email";
		MessageBuilder builder= new MainMessageBuilder().getBuilder(type);
		builder.messageBuilder();
		

	}

}
/*****
 * Creational:-
 * 1.SingleTon
 * 2.FactoryMethod
 * 3.Factory
 * 4.prototype
 * 5.builder
 * 
 *
 *Behavioral:-
 *
 *Mediator
 *Chain of responsibilty
 *observer
 *Stretegy
 *command
 *stage
 *visitor
 *interpretor
 *iterator
 *memento
 *
 *
 *
 *
 *
 *
 *Structural:-
 *
 *Adaptor
 *composite
 *proxy
 *Brigade
 *flywait
 *facade
 *Decorator
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
