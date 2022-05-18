# Activity_life_cycle_flow
This project helpful to understand activity life cycle methods

An Android activity is one screen of the Android app's user interface.Activities are stored in stack (A stack is an abstract data type that holds an ordered, linear sequence of items. In contrast to a queue, a stack is a last in, first out (LIFO) structure).Each activity should be declared in Manifest file.When you create a activity it genrates two file on is XML file for User Interface and one is java file to control the UI.

Activity launches with some rules that is called lauch mode there are four types of launch modes are there.

<B>Launch Modes<B>
-----------------------
1)Standard-->by Default<br>
2)Single Top.<br>
3)Single instance.<br>
4)singleTask.<br>
  
Stack:Last in First out
Standard


SingleTop
OnNewIntent 
if the instance is Top of the task then new Instance will be not created.if it is not in a top then it will created.

SingleTask
At a time one activity will be created.No duplicated actvity is created(Singleton)
OnNewIntent() method will receive the callback.

Task_Affinty
------------------
Seperate task  All pop from stack except we mark SigleTask as a activity


Task_With_out_Affinty
-------------------------
All not pop only upper activity will be pop up than SigleTask as a activity


SingleInstance
only activty per intire task
  
  
//This is used to set dynamacally set launch modes
Intent Flags
----------------
startActvity()
FLAG_ACTIVITY_NEW_TASK(Single Task)
FLAG_ACTIVITY_SINGLE_TOP(Single Top)
FLAG_ACTIVITY_CLEAR_TOP
  

<B>Seven Important Life Cycle Methods<B>
-------------------------------------------
onCreate()<br>Invoked when activity is created it run only once when app launch. used to initlized the variables and binding the xml layout to java file.<br>

onStart()<br>Invoked after the on create method when app is ready to start but no started yet.<b>

onResume()<br>Invoked when app launch 1st time and whenever app is comes from background to forgroudnd state<br>

onPause()<br>Invoked when app is pause state and app goes to forground state to background state it run before the onStop.<br>

onStop()<br>Invoked when app is no longer visible to user.Run after onPause method.<br>

onRestart()<br>Invoked when app is ready for visible to user but not visible yet.Run before onStart and onResume method.<br>

onDestroy()<br>Invoked when app is removed from memory(Stack)<br>

<B>Flow of Methods<B>
-----------------
When app launch 1st time<br>
OnCreate>onStart>onResume<br>

When user press Home button<br>
onPause>onStop

When user come back to app<br>
onRestart>onStart>onResume

When user back press from launched Activity<br>
OnPause>onStart>onDestroy
  
<B>Some More Methods when orientation is changed<B>
---------------------------
onSaveInstanceState-->When orientation changed you need to manage the state of activity for Example value of any widget.
  
onRestoreInstanceState-->When orientation restored. 
