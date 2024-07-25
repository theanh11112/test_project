using System;
using System.IO;
using System.Net.Http;
using System.Threading.Tasks;

namespace DownloadImage
{
    class Program
    {
        static async Task Main(string[] args)
        {
            string imageUrl = "https://photo.znews.vn/w660/Uploaded/qhj_yvobvhfwbv/2018_07_18/Nguyen_Huy_Binh1.jpg"; // Thay bằng URL của ảnh
            string filePath = "downloaded_image.jpg"; // Đường dẫn nơi bạn muốn lưu ảnh

            await DownloadImageAsync(imageUrl, filePath);
        }

        static async Task DownloadImageAsync(string url, string filePath)
        {
            using (HttpClient client = new HttpClient())
            {
                try
                {
                    HttpResponseMessage response = await client.GetAsync(url);

                    if (response.IsSuccessStatusCode)
                    {
                        byte[] imageBytes = await response.Content.ReadAsByteArrayAsync();
                        await File.WriteAllBytesAsync(filePath, imageBytes);
                        Console.WriteLine("Image downloaded and saved to " + filePath);
                    }
                    else
                    {
                        Console.WriteLine($"Failed to download image. HTTP status code: {response.StatusCode}");
                    }
                }
                catch (HttpRequestException e)
                {
                    Console.WriteLine("Error downloading image: " + e.Message);
                }
                catch (Exception e)
                {
                    Console.WriteLine("An unexpected error occurred: " + e.Message);
                }
            }
        }
    }
}
