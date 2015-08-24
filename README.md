# NetworkRequests
Codes from https://guides.codepath.com/android/Sending-and-Managing-Network-Requests#displaying-remote-images-the-easy-way

Duraion: 1 hr

Device: Emulator

Testing: Working with minor code changes
1. Picasso.with(context).load(imageUri).into(ivBasicImage); --> Picasso.with(this).load(imageUri).into(ivBasicImage);
2. Removed finally --> Added in.close() in try{}  

![alt tag](https://cloud.githubusercontent.com/assets/11301947/9433229/4c84a1b4-49e4-11e5-9aef-e4ef4e2254eb.png)
