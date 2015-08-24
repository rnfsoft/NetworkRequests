# NetworkRequests

Codes from https://guides.codepath.com/android/Sending-and-Managing-Network-Requests#displaying-remote-images-the-easy-way

Duraion: 1 hr

Device: Emulator

Testing: Working with minor code changes

Picasso.with(context).load(imageUri).into(ivBasicImage); --> Picasso.with(this).load(imageUri).into(ivBasicImage);

Removed finally --> Added in.close() in try{}
