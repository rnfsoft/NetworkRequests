# NetworkRequests

Codes from https://guides.codepath.com/android/Sending-and-Managing-Network-Requests#displaying-remote-images-the-easy-way

Duraion: 1 hr

Device: Emulator

Testing: Working with minor code changes

1. Picasso.with(context).load(imageUri).into(ivBasicImage); --> Picasso.with(this).load(imageUri).into(ivBasicImage);

2. Removed finally --> Added in.close() in try{}

![alt tag](https://cloud.githubusercontent.com/assets/11301947/9433376/b3a8074e-49e6-11e5-86f0-5563c8d56c58.png)
