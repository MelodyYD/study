function openModalbook(imageSrc, title, writer, description) {
    const modal1 = document.getElementById("bookModal");
    const modalImage = document.getElementById("modalImageBook");
    const caption = document.getElementById("captionBook");

    modal1.style.display = "block";
    modalImage.src = imageSrc;

    caption.innerHTML = `
    <strong class="modal-title">${title}</strong><br>
    <span class="modal-writer">${writer}</span><br><br><br>
    <span class="modal-description">${description}</span>
    `;

    document.body.style.overflow = "hidden";
}

function openModalsong(videoUrl, title, writer, description) {
    const modal2 = document.getElementById("songModal");
    const modalVideo = document.getElementById("modalVideo");
    const caption = document.getElementById("captionSong");

    modal2.style.display = "block";
    modalVideo.src = videoUrl;

    caption.innerHTML = `
        <strong class="modal-title">${title}</strong><br>
        <span class="modal-writer">${writer}</span><br><br><br>
        <span class="modal-description">${description}</span>
    `;

    document.body.style.overflow = "hidden";
}

function openModaldrama(imageSrc, title, airDate, description) {
    const modal3 = document.getElementById("dramaModal");
    const modalImage = document.getElementById("modalImageDrama");
    const caption = document.getElementById("captionDrama");

    modal3.style.display = "block";
    modalImage.src = imageSrc;

    caption.innerHTML = `
    <strong class="modal-title">${title}</strong><br>
    <span class="modal-writer">${airDate}</span><br><br><br>
    <span class="modal-description">${description}</span>
    `;

    document.body.style.overflow = "hidden";
}

function closeModal() {
    const modal1 = document.getElementById("bookModal");
    const modal2 = document.getElementById("songModal");
    const modalVideo = document.getElementById("modalVideo");
    const modal3 = document.getElementById("dramaModal");

    modal1.style.display = "none"; // 책 모달 닫기
    modal2.style.display = "none"; // 음악 모달 닫기
    modalVideo.src = "";
    modal3.style.display = "none"; // 극 모달 닫기
    document.body.style.overflow = ""; // 스크롤 복원
}

let lastScrollTop = 0;
const navbar = document.getElementById('navbar');

window.addEventListener('scroll', function() {
    const scrollTop = window.pageYOffset || document.documentElement.scrollTop;

    if (scrollTop > lastScrollTop) {
        // 아래로 스크롤할 때
        navbar.style.top = '-60px'; // 메뉴바 숨기기
    } else {
        // 위로 스크롤할 때
        navbar.style.top = '0'; // 메뉴바 보이기
    }
    lastScrollTop = scrollTop; // 마지막 스크롤 위치 업데이트
});
