Problem Description

Many people have trouble keeping track of tasks, deadlines, and important reminders. This can lead to missing due dates and reduced productivity.
My project will solve this by creating a Task Manager Application where users can:

- Add tasks

- Set priority levels

- Choose due dates

- Receive alerts before deadlines

- Get reminders through the app, email, or SMS

The goal is to help users stay organized and avoid forgetting important tasks.

Design Choice and Tools

I chose to build this project in Java because it is object-oriented, organized, and good for building structured applications. Java makes it easy to work with classes, lists, sorting, and scheduling reminders.
This structure will also allow the project to grow later, for example adding login systems, calendars, or notifications.

Big-O Expectations

The main operations of the system involve adding tasks, searching tasks, and sorting them by due date or priority.

- Adding a task: O(1) — simple list insertion

- Searching for tasks: O(n) — linear search through the list

- Sorting tasks by date/priority: O(n log n) — using built-in Java sorting algorithms

- Sending reminders: O(n) — checking each task’s deadline

Overall, the expected performance is efficient because most actions happen in constant or logarithmic time.

UML Diagram

+-------------------+
|      Task         |
+-------------------+
| - title           |
| - dueDate         |
| - priority        |
| - reminderType    |
+-------------------+
| + setReminder()   |
| + getInfo()       |
+-------------------+

+-------------------+
|   TaskManager     |
+-------------------+
| - taskList        |
+-------------------+
| + addTask()       |
| + removeTask()    |
| + sortTasks()     |
| + sendAlerts()    |
+-------------------+
