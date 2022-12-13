### Question 1
Host Tracker: Server names consist of an alphabetic host type (e.g. "apibox")
concatenated with the server number, with server numbers allocated as before
(so, "apibox:1", "apibox:2", etc. are valid hostnames). Write a name tracking class with two operations,
allocate(host_type) and deallocate(hostname). The former should reserve and return the next available hostname,
while the latter should release that hostname back into the pool. 

**Examples:**
```
Input:
allocate("apibox")
Output:
"apibox:1"

Input:
allocate("apibox")
Output:
"apibox:2"

Input:
deallocate("apibox")

Input:
allocate("apibox")
Output:
"apibox:1"

Input:
allocate("sitebox")
Output:
"sitebox:1"
```