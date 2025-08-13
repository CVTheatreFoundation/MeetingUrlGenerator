# Chartiers Valley School Board Export URL Generator
As part of the [Chartiers Valley Historical Society](https://chartiersvalley.com), we're dedicated to preserving the 
history of Chartiers Valley School District. As part of that mission, we archive online school board meeting agendas
and minutes on our [website](https://chartiersvalley.org/archive-board) for all to view. 

To archive these sessions, we use [Archive Team's Grab Site](https://github.com/ArchiveTeam/grab-site) to recursively
visit, archive, and export the pages.

The district's board website is outdated and challenging to navigate. At times, it employs up to 7 nested IFrames to
present navigation and content. Typical web crawlers rely on links found in page source code to traverse effectively.

This project generates a file of new line delimited URLs that can be used with the `grab-site` command to archive the
entire history of the Chartiers Valley School Board website.

The URLs require a numerical meeting ID that increments by 1 for each meeting. On average there are 24 meetings per year.
The first meeting ID is `0`. The meeting from 2025-08-12 is `819`.

## Generating URLs
Simply run the main class `com.chartiersvaley.archive.Generator` to create a file named `urls.txt` with the URLs from 0 to
1,000.

## Using the URLs
Using grab-site, you can provide the input param `--input-file /path/to/urls.txt` to use the URLs as the starting points
for the crawler.