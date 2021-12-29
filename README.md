# Sharepoint module for Mendix

A Mendix module which is focused on working with files on Sharepoint sites.

## Features and limitations

 - An explorer interface (for sites and drives)
 - Search sites
 - Retrieve lists for sites
 - Retrieve and create list items
 - Read and modify fields (columns) of list items
 - Download and upload files (as drive and list items)
 - Retrieve drives

## Dependencies
This module depends on the following modules:
 - Encryption
 - Community Commons
 - Microsoft Graph

## Usage
This module is typically applied when:
 - Files stored within Sharepoint have to be made available in a Mendix application
 - Files, uploaded at the Mendix application, are to be stored within a Sharepoint site

## Installation
Assuming the dependencies mentioned earlier are already part of your application, perform the following steps:
 - Add the `Explorer` snippet from the module to an administration part of your app.
 - Create an `Authorization` through the Microsoft Graph module. Make sure it has the Sites scopes (e.g. `Sites.Read.All` or `Sites.ReadWrite.All`).
 - Explore the Sharepoint sites using the explorer interface.
 - To integrate with application logic, use the microflows from the `_USE_ME` folder.

