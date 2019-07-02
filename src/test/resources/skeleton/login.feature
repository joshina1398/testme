Feature: login




Scenario Outline:to login
 Given login portal is open
 When username "<userName>" password is entered "<password>"
 Then login successful 
 Examples:
| userName  | password|
|mercury  |  mercury|
|tutorial  |  tutorial|