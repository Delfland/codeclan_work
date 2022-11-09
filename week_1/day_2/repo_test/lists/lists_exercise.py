# 1. Create an empty list called `task_list`
tasklist = ["get up", "wash dishes", "brush teeth"]
# 2. Add a few `str` elements, representing some everyday tasks e.g. 'Make Dinner'
tasklist.append("Make dinner")
tasklist.append("do laundry")
# 3. Print out `task_list`
print(tasklist)
# 4. Remove the last task
tasklist.pop()
# 5. Print out `task_list`
print(tasklist)
# 6. Print out the number of elements in `task_list`
print(len(tasklist))

task_list2 = ["change clothes"]

all_tasks = tasklist + task_list2 #concatenate 2 lists into 1 new list
print(all_tasks)