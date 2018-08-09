# CriminalIntent

An Android app that records the details of "office crimes" - things like leaving dirty dishes in the breakroom sink or walking awat from an
empty shared printer after documents have printed.

<p>This app is based on a list-detail interface: The main screen will display a list of recorded crimes.
The users will be able to add new crimes or select an existing crime to view and edit its details.
The users will also be able to delete a crime that has been created before.</p>

With CriminalIntent, you can: 
<li>make a record of a crime including a title, a date, and a photo</li>
<li>identify a suspect from your contacts and lodge a complaint via email, Twitter, Facebook, or another app</li>
<li>document and report a crime</li>

<h3>Implementation Details:</h3>
<li>Built the app using the MVC architecture (Java objects, view hierarchy and controller objects 
- <b>Activities</b> and <b>Fragments</b>). Designed the model layer with Singleton pattern.</li>
<li>Implemented displaying a list of crimes with <b>RecyclerView</b>. Polished the UI of list items with <b>ConstraintLayout</b>.</li>
<li>Implemented data communication between master and detail fragments with <b>Explicit Intents</b>, <b>Intent Extras</b> 
and <b>Fragment Arguments</b>.</li>
<li>Let users navigate between list items by swiping across the screen to "page" forward or backward through the crimes with 
<b>ViewPager</b>.</li>
<li>Added a dialog in which users can change the date of a crime using <b>DialogFragment</b>, <b>AlertDialog</b> and 
<b>DatePicker</b>.</li>
<li>Created a menu for the app that will be displayed in the toolbar using <b>AppCompat</b> library. This menu will have an action item that lets users 
add a new crime, an up button that lets users navigate back to the list screen, and a delete item that lets users delete a crime.</li>
<li>Implemented data persistent storage using <b>SQLite Databases</b>.</li>
<li>Enabled users picking a suspect for a Crime from the user's list of contacts and sending a text-based report of a crime
using <b>Implicit Intents</b>.</li>
<li>Enabled users taking a picture as the photo of the crime and storing the image locally using <b>Implicit Intents</b>, 
<b>FileProvider</b> and <b>BitmapFactory</b>.</li>
<li>Created a tablet interface for the app that allows users to see and interact with the list of crimes and the details of 
an individual crime at the same time, i.e., a two-pane master-detail interface with <b>Resource Qualifiers</b> and 
<b>Fragment Callback Interfaces</b>.</li>
<li>Implemented <b>Localization</b> so that the app can support both English, Chinese and Spanish based on users' language settings.</li>
