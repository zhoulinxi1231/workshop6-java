Set-Location "C:\Users\zlxixi\Doubao\chats\2026-11-11\new-chat-2\Workshop6"
$host.UI.RawUI.WindowTitle = "Java Workshop 6 - 按任意键继续"

function Run-And-Wait($title, $cmd) {
    Clear-Host
    Write-Host ""
    Write-Host "===========================================" -ForegroundColor Cyan
    Write-Host "  $title" -ForegroundColor Cyan
    Write-Host "===========================================" -ForegroundColor Cyan
    Write-Host ""
    Invoke-Expression $cmd
    Write-Host ""
    Write-Host "-------------------------------------------" -ForegroundColor Yellow
    Write-Host "  >> 现在可以截图了！截完按任意键跑下一题 <<" -ForegroundColor Yellow
    Write-Host "-------------------------------------------" -ForegroundColor Yellow
    $null = $Host.UI.RawUI.ReadKey("NoEcho,IncludeKeyDown")
}

Run-And-Wait "Exercise 1 - 10 Songs" "java Exercise1_Songs"
Run-And-Wait "Exercise 2 - Songs Sorted A-Z" "java Exercise2_SongsSorted"
Run-And-Wait "Exercise 3 - Reverse Each Word" "java Exercise3_ReverseWords"
Run-And-Wait "Exercise 4 - Decode Message" "java Exercise4_Decoder"
Run-And-Wait "Exercise 5 - Search Engine" "java Exercise5_SearchEngine"
Run-And-Wait "Exercise 6 - Static vs Instance" "java Exercise6_IdentifyMyParts"
Run-And-Wait "Exercise 7 - Boxes" "java -cp Exercise7 BoxDriver"

Clear-Host
Write-Host ""
Write-Host "===========================================" -ForegroundColor Green
Write-Host "  全部 7 题跑完了！" -ForegroundColor Green
Write-Host "  窗口可以关了，去 docx 里粘贴截图吧" -ForegroundColor Green
Write-Host "===========================================" -ForegroundColor Green
Write-Host ""
$null = $Host.UI.RawUI.ReadKey("NoEcho,IncludeKeyDown")
