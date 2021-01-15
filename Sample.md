Rangabhatla,Sai Pranav : Copy of CareAware Core JIRA Best Practices    

1.  [Rangabhatla,Sai Pranav](index.html)

Rangabhatla,Sai Pranav : Copy of CareAware Core JIRA Best Practices
===================================================================

Created on Jan 15, 2021|<br><br>Table of Contents<br><br>|
|---|
|<br><br>*   1 [Overview](#CopyofCareAwareCoreJIRABestPractices-Overview)<br>    *   1.1 [JIRA Sub-tasks](#CopyofCareAwareCoreJIRABestPractices-JIRASub-tasks)<br>    *   1.2 [Terms](#CopyofCareAwareCoreJIRABestPractices-Terms)<br>    *   1.3 [High Level Process Diagram](#CopyofCareAwareCoreJIRABestPractices-HighLevelProcessDiagram)<br>*   2 [In Development Steps](#CopyofCareAwareCoreJIRABestPractices-InDevelopmentSteps)<br>    *   2.1 [Assemble the team](#CopyofCareAwareCoreJIRABestPractices-Assembletheteam)<br>    *   2.2 [Setup feature](#CopyofCareAwareCoreJIRABestPractices-Setupfeature)<br>    *   2.3 [Requirement changes](#CopyofCareAwareCoreJIRABestPractices-Requirementchanges)<br>    *   2.4 [Design changes](#CopyofCareAwareCoreJIRABestPractices-Designchanges)<br>    *   2.5 [Test Strategy](#CopyofCareAwareCoreJIRABestPractices-TestStrategy)<br>    *   2.6 [Documentation](#CopyofCareAwareCoreJIRABestPractices-Documentation)<br>    *   2.7 [Make code changes](#CopyofCareAwareCoreJIRABestPractices-Makecodechanges)<br>    *   2.8 [Review code changes](#CopyofCareAwareCoreJIRABestPractices-Reviewcodechanges)<br>    *   2.9 [Approve DIO Form](#CopyofCareAwareCoreJIRABestPractices-ApproveDIOForm)<br>*   3 [Post Development Steps](#CopyofCareAwareCoreJIRABestPractices-PostDevelopmentSteps)<br>    *   3.1 [Promote to ENG](#CopyofCareAwareCoreJIRABestPractices-PromotetoENG)<br>        *   3.1.1 [If manual testing is needed:](#CopyofCareAwareCoreJIRABestPractices-Ifmanualtestingisneeded:)<br>    *   3.2 [Update Cert Guidelines](#CopyofCareAwareCoreJIRABestPractices-UpdateCertGuidelines)<br>    *   3.3 [Promote to QA](#CopyofCareAwareCoreJIRABestPractices-PromotetoQA)<br>    *   3.4 [Automated Testing](#CopyofCareAwareCoreJIRABestPractices-AutomatedTesting)<br>    *   3.5 [Promote to Master](#CopyofCareAwareCoreJIRABestPractices-PromotetoMaster)<br>    *   3.6 [Update Affected/Fix Versions (as applicable)](#CopyofCareAwareCoreJIRABestPractices-UpdateAffected/FixVersions(asapplicable))<br>*   4 [JIRAs Not Requiring Full Process](#CopyofCareAwareCoreJIRABestPractices-JIRAsNotRequiringFullProcess)<br><br>|

Overview
========

This document serves as a best practices guideline for the work steps to complete a JIRA (also called a "feature").

This is NOT an official process document. The official process is located at [ProcessIT](https://wiki.ucern.com/display/public/processIT/ProcessIT). If there is any conflict between the information in this guideline and the official process, the official process should be followed. The intent of this document is to provide a simple walk through implementing a single feature.

### JIRA Sub-tasks

JIRA sub-tasks are used to track the progress and collaboration of a feature. Try to document any communication and decisions that are made on the JIRA sub-tasks, even when the discussions are offline.

Not only do these sub-tasks provide an audit trail, but they also helps to provide context when looking back at a JIRA years later. To determine if your JIRA needs required Full Process (JIRA Sub-Tasks), please reference the [JIRA Process FAQ](https://wiki.cerner.com/display/public/IPDevConDoc/JIRA+Process+FAQ).

### Terms

  

Click here to expand...
|Term|Definition|
|---|---|
|DI|Design input - the requirements and hazards for a feature|
|DIO|Design input and output - the design input and output for a feature|
|DIO Form|a JIRA used to collect DI, DO and electronic signatures agreeing to the changes in DI/DO|
|DNG/Jazz|Requirements management tool used by solution designers|
|DO|Design output - the design and code applicable to a feature|
|ENG|Engineer|
|Feature|Also called a JIRA or project - an incremental code change requiring DIO documentation|
|PR|Pull request|
|QA|Quality Assurance|
|RQM|Test management tool used by the Quality Assurance team|
|SD|Solution Designer|

  

### High Level Process Diagram

![](attachments/2423661312/2423661289.png)

In Development Steps
====================

Follow the steps described below when implementing your feature JIRA.

  

### Assemble the team

1.  Once you begin to work on your assigned feature, move the JIRA status to "In Progress".
2.  Ensure the appropriate team is assembled for each project. This team includes:
    *   3 additional engineers (called the cohort). This must include at least one knowledge expert in the code you are changing.
    *   1 QA member.
        *   If you do not already know the QA member, tag Tim Rhodes in the Test Strategy sub-task and he will assign the sub-task to a Quality Assurance (QA) member.
    *   The Solution Designer (SD), which is Kolton Holbrook.
    *   Include other stakeholders when applicable (i.e. strategists, architects from other teams, etc.)

  

### Setup feature

1.  For each Git repo, create a branch with the name of the JIRA issuekey you are assigned.
    *   For example: IBUSCORE-12345
2.  Once you've done that, you'll perform the following actions in the [Dev Dashboard](https://ibus-development.devcareaware.net/my-features) to get started (ex. [access actions](attachments/2423661312/2423661292.gif)):
    *   Featurize
    *   Create Pull Requests
    *   Create sub-tasks
    *   Create DIO JIRA

*   After creating the DIO Form (JFORMS issue) it will appear in the issue links
    *   [Example](attachments/2423661312/2423661309.png)

  

### Requirement changes

1.  Discuss any required hazard or requirement changes with cohort team.
2.  Assign the Hazards/Requirements sub-task to Kolton Holbrook.
    *   Kolton will add the necessary links to the DIO form (ex. [DI links.png](attachments/2423661312/2423661310.png)) and Requirements/Hazards sub-task.
    *   Kolton will close the Hazards/Requirements sub-task once complete

  

### Design changes

Discuss any required design changes with engineering cohort.

**If there are NO changes to the design**

1.  List link on the DIO form with the latest approved version and "No changes to design" in the Technical Design Documentation of the DIO form
    *   [Tutorial](attachments/2423661312/2423661307.gif)
    *   [Example](attachments/2423661312/2423661306.png)

**If there ARE changes to the design**

1.  Makes updates to the Technical Design wiki page
2.  When updates are complete, assign the engineering cohort to sign the wiki page and include the JIRA issue key as a comment
    *   [Tutorial](attachments/2423661312/2423661305.gif)
3.  Get a wiki diff link that includes all Design changes and add it to the Technical Design Documentation of the DIO form
    *   [Tutorial](attachments/2423661312/2423661304.gif)
    *   [Example](attachments/2423661312/2423661303.png)
4.  Close the Design sub-task.

  

### Test Strategy

1.  Document how the change will be tested by adding a comment with the testing strategy. This includes:
    *   How you will verify the implementation (white box)?
    *   How will you validate requirements (black box)?
    *   Is there any additional testing needed?
    *   Answer QA questions, and include specific requirements being tested or if new tests added.
    *   [Example](attachments/2423661312/2423661301.png)  
        
2.  Have the engineering cohort +1 if they agree, or comment on suggested changes. QA should agree with strategy, even if no manual testing is needed.
3.  QA will close the sub-task.

  

### Documentation

1.  Discuss any documentation changes required with the engineering cohort team.
    *   Think about client-facing reference pages, developer guides, configuration changes, or anything a consumer of the code change would need to be aware of.
2.  Add a link to any wiki changes to Documentation sub-task.
    *   If there are no changes, state why no changes were necessary along with a brief description of the code change to be made.

  

### Make code changes

1.  Implement all code changes.  
    
2.  Prior to creating a review, make sure to perform any applicable testing locally.
3.  Have the code reviewed.  
    1.  It is common for a project to require multiple code review passes to complete all the necessary code changes.

  

### Review code changes

1.  Move the JIRA status to "In Review".
2.  Use the [Dev Dashboard](https://ibus-development.devcareaware.net/my-features) to set up a review using the "Create Crucible Review" action.
    *   All engineering cohort members must complete the review.
3.  Add the links of all PRs to the DO tab.
    *   [Example](attachments/2423661312/2423661302.png)
4.  Close Code sub-task

  

### Approve DIO Form

**This signoff signifies a complete review of the artifacts and final approval!**

1.  Edit the DIO JIRA form and add approvers (Edit → General)
    *   Add the 3 engineering cohort + SD as DI approvers.
    *   Add the 3 engineering cohort as DO approvers.  
        
    *   Approvals can be seen on the [Approvals tab](attachments/2423661312/2423661295.png) at the bottom of the DIO form. Approvers will have options to [accept or reject ](attachments/2423661312/2423661294.png)DI/DO.  
        
    *   [Example](attachments/2423661312/2423661291.png)
2.  Check to see that DI has been completed (ex. [DI complete](attachments/2423661312/2423661290.png)).
3.  Ensure DO links have been added (if missed – see above "Design Changes" and "Review code changes" sections).
4.  Promote the DIO form status to DI and DO Approval Ready.
    *   This should automatically notify the cohort + SD that the DIO form is ready to sign  
        
    *   [Tutorial](https://cernerprod.sharepoint.com/sites/ipprocessmanagementforum/Shared+Documents/Forms/AllItems.aspx?viewid=f68b853c%2Db2d5%2D466e%2Dac8f%2Db2ab473c9a84&sortField=View%5Fx0020%5FOrder&isAscending=true&id=%2Fsites%2Fipprocessmanagementforum%2FShared+Documents%2FApproval+Workflow%2Emp4&parent=%2Fsites%2Fipprocessmanagementforum%2FShared+Documents)  
        
    *   [Example](attachments/2423661312/2423661293.png)

The DIO form will close after ~15 minutes of final signature.

*   If there are changes needed to the form after it's been signed, use the Update DI/DO workflow and re-complete Sign the DIO Form.
    *   [Example](attachments/2423661312/2423661300.png)

  

Post Development Steps
======================

All code reviews should be complete, and all related development subtasks closed prior to performing these steps.

### Promote to ENG

1.  Promote the feature to the eng pipeline using the [Dev Dashboard](https://ibus-development.devcareaware.net/my-features)
    1.  [Example](attachments/2423661312/2423661299.png)
2.  Ensure all tests pass
    1.  #### If manual testing is needed:
        
        1.  QA will create ENG and QA test sets in RQM and add links in JIRA.
        2.  Execute the manual test plan in RQM against a live domain (local domain is not allowed) and attach test evidence.
        3.  Add a link from your JIRA to white box evidence (typically surefire report)
        4.  Add a link from your JIRA to any automated black box test evidence (surefire link).
    2.  **If NO manual testing is needed:**
        1.  Add a link from your JIRA to white box evidence (typically surefire report link)
        2.  Add a link from your JIRA to black box test evidence (surefire link).
        3.  Perform smoke testing (against a live domain, not local), providing information on where and how you tested, using Jenkins built endstates. A descriptive comment and/or screenshots will suffice.
3.  Add any applicable evidence to the Engineer Testing sub-task
4.  Close the Engineer Testing sub-task
5.  Move the JIRA status to "Dev Review Done"

### Update Cert Guidelines

Cert Guidelines need to be updated on the JIRA before it can be promoted to QA. The minimum required Cert Guidelines fields are:

1.  Release Text Description (Couple sentence summary of the change)
2.  Testing options:  
    *   Canned responses for testing options if you do not have custom testing options.
        *   No certification testing is provided, because the solution change contains modifications that require undue effort to test or potentially harmful system configurations to test. As part of your regression testing, ensure that your system is working as expected.
        *   No certification testing is provided, because the solution change contains updates not visible to users. As part of your regression testing, ensure that your system is working as expected.

Reference : [How to Add/Edit Cert Guidelines](https://github.cerner.com/ibus-core-internal/ibus-dev-tools/wiki/Additional-Configuration-Information#how-to-addedit-cert-guidelines)

### Promote to QA

1.  Promote the feature to the qa pipeline using the [Dev Dashboard](https://ibus-development.devcareaware.net/my-features)
2.  Notify QA your change has successfully completed Engineer Testing
3.  QA will close the QA Testing sub-task once testing has successfully completed

### Automated Testing

**Note:** the Automated Testing sub-task is NOT for JUNIT tests! It is a placeholder for an Automation Engineer for eggplant/workflow testing. QA will close this sub-task or assign it to a member of the QA automation team.

### Promote to Master

Merge to master once QA testing has successfully completed and the QA testing sub-task is closed.

1.  *   Verify that the version of each artifact is correct.

**Changes in master are final**. Once a Jira is in master, further code changes for that Jira are prohibited. A new Jira must be created for additional changes.

  

### Update Affected/Fix Versions (as applicable)

1.  Fix version for JIRAs should list the cloud version and a non-cloud version when it can be tested in both. Ask your manager or PM for guidance if unsure for your JIRA.  
    *   [Example](attachments/2423661312/2423661298.png)
2.  Apply the version of the next cloud and traditional release as applicable.
    *   [Cloud Release Schedule](https://pages.github.cerner.com/DWxiBusCloud/cloud_documentation/releasing-changes/schedule-current/)
    *   [Traditional Release Schedule](https://wiki.ucern.com/display/careaware/CareAware+Release+Dates)
3.  For defects:  
    1.  Apply all affected traditional versions and the most recently available cloud version.
    2.  If a JIRA introduced this defect, then select[ More → Link](attachments/2423661312/2423661297.png) and [Introduced by](attachments/2423661312/2423661296.png). Enter the Introductory JIRA issue key.

**JIRAs Not Requiring Full Process**
====================================

Some JIRAs may not require full process (ex. JUNIT changes) and will only need the code and testing sub-tasks (See Development Steps above). If unsure of whether full process is required, please reference [JIRA Process FAQ](https://wiki.cerner.com/display/public/IPDevConDoc/JIRA+Process+FAQ).

Attachments:
------------

![](images/icons/bullet_blue.gif) [High Level Process diagram](attachments/2423661312/2423661288) (application/gliffy+json)  
![](images/icons/bullet_blue.gif) [High Level Process diagram.png](attachments/2423661312/2423661289.png) (image/png)  
![](images/icons/bullet_blue.gif) [DI complete.png](attachments/2423661312/2423661290.png) (image/png)  
![](images/icons/bullet_blue.gif) [DIO Approvers.png](attachments/2423661312/2423661291.png) (image/png)  
![](images/icons/bullet_blue.gif) [Dashboard Actions.gif](attachments/2423661312/2423661292.gif) (image/gif)  
![](images/icons/bullet_blue.gif) [DI DO approval ready.png](attachments/2423661312/2423661293.png) (image/png)  
![](images/icons/bullet_blue.gif) [Approve Reject buttons.png](attachments/2423661312/2423661294.png) (image/png)  
![](images/icons/bullet_blue.gif) [DIO Approvals tab.png](attachments/2423661312/2423661295.png) (image/png)  
![](images/icons/bullet_blue.gif) [Introduced by.png](attachments/2423661312/2423661296.png) (image/png)  
![](images/icons/bullet_blue.gif) [More Link.png](attachments/2423661312/2423661297.png) (image/png)  
![](images/icons/bullet_blue.gif) [Versions.png](attachments/2423661312/2423661298.png) (image/png)  
![](images/icons/bullet_blue.gif) [Promote to eng.png](attachments/2423661312/2423661299.png) (image/png)  
![](images/icons/bullet_blue.gif) [Update DIO content.png](attachments/2423661312/2423661300.png) (image/png)  
![](images/icons/bullet_blue.gif) [Test Strategy.png](attachments/2423661312/2423661301.png) (image/png)  
![](images/icons/bullet_blue.gif) [Pull requests on DO.png](attachments/2423661312/2423661302.png) (image/png)  
![](images/icons/bullet_blue.gif) [DO complete - design changes.png](attachments/2423661312/2423661303.png) (image/png)  
![](images/icons/bullet_blue.gif) [Design with changes.gif](attachments/2423661312/2423661304.gif) (image/gif)  
![](images/icons/bullet_blue.gif) [Wiki approval change comment.gif](attachments/2423661312/2423661305.gif) (image/gif)  
![](images/icons/bullet_blue.gif) [DO complete.png](attachments/2423661312/2423661306.png) (image/png)  
![](images/icons/bullet_blue.gif) [Design - no changes.gif](attachments/2423661312/2423661307.gif) (image/gif)  
![](images/icons/bullet_blue.gif) [DO no design changes.png](attachments/2423661312/2423661308.png) (image/png)  
![](images/icons/bullet_blue.gif) [DIO link.png](attachments/2423661312/2423661309.png) (image/png)  
![](images/icons/bullet_blue.gif) [DI links.png](attachments/2423661312/2423661310.png) (image/png)  

Document generated by Confluence on Jan 15, 2021 09:55

[Atlassian](http://www.atlassian.com/)