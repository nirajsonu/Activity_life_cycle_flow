# Activity_life_cycle_flow
This project helpful to understand activity life cycle methods

An Android activity is one screen of the Android app's user interface.

<B>Seven Important Life Cycle Methods<B>
-------------------------------------------
onCreate()<br>Invoked when activity is created it run only once when app launch. used to initlized the variables and binding the xml layout to java file.<br>

onStart()<br>Invoked after the on create method when app is ready to start but no started yet.<b>

onResume()<br>Invoked when app launch 1st time and whenever app is comes from background to forgroudnd state<br>

onPause()<br>Invoked when app is pause state and app goes to forground state to background state it run before the onStop.<br>

onStop()<br>Invoked when app is no longer visible to user.Run after onPause method.<br>

onRestart()<br>Invoked when app is ready for visible to user but not visible yet.Run before onStart and onResume method.<br>

onDestroy()<br>Invoked when app is removed from memory(Stack)<br>
