const video = document.getElementById("video");

function startVideo() {
  navigator.getUserMedai(
	{video : {} },
	stream => video.srcObject = stream,
	err => console.error(err)
  )
}

startVideo()

